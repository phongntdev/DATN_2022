package com.example.huhacha.service;

import com.example.huhacha.DTO.OrderDto;
import com.example.huhacha.entitis.Order;
import com.example.huhacha.mapper.OrderMapper;
import com.example.huhacha.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional
public class OrderService {
    private final OrderRepository repository;
    private final OrderMapper orderMapper;

    public OrderService(OrderRepository repository, OrderMapper orderMapper) {
        this.repository = repository;
        this.orderMapper = orderMapper;
    }

    public OrderDto save(OrderDto orderDto) {
        Order entity = orderMapper.toEntity(orderDto);
        return orderMapper.toDto(repository.save(entity));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public OrderDto findById(Long id) {
        return orderMapper.toDto(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public Page<OrderDto> findByCondition(OrderDto orderDto, Pageable pageable) {
        Page<Order> entityPage = repository.findAll(pageable);
        List<Order> entities = entityPage.getContent();
        return new PageImpl<>(orderMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public OrderDto update(OrderDto orderDto, Long id) {
        OrderDto data = findById(id);
        Order entity = orderMapper.toEntity(orderDto);
        BeanUtil.copyProperties(data, entity);
        return save(orderMapper.toDto(entity));
    }
}