package com.example.huhacha.controller;

import com.example.huhacha.DTO.Oder_detailDto;
import com.example.huhacha.entitis.Oder_detail;
import com.example.huhacha.mapper.Oder_detailMapper;
import com.example.huhacha.service.Oder_detailService;
//import com.sun.tools.javac.util.DefinedBy.Api;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/oder-_-detail")
@RestController
@Slf4j
@Api("oder-_-detail")
public class Oder_detailController {
    private final Oder_detailService oder_detailService;

    public Oder_detailController(Oder_detailService oder_detailService) {
        this.oder_detailService = oder_detailService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated Oder_detailDto oder_detailDto) {
        oder_detailService.save(oder_detailDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Oder_detailDto> findById(@PathVariable("id") short id) {
        Oder_detailDto oder_detail = oder_detailService.findById(id);
        return ResponseEntity.ok(oder_detail);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") short id) {
        Optional.ofNullable(oder_detailService.findById(id)).orElseThrow(() -> {
            log.error("Unable to delete non-existent data！");
            return new ResourceNotFoundException("a");
        });
        oder_detailService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<Oder_detailDto>> pageQuery(Oder_detailDto oder_detailDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<Oder_detailDto> oder_detailPage = oder_detailService.findByCondition(oder_detailDto, pageable);
        return ResponseEntity.ok(oder_detailPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated Oder_detailDto oder_detailDto, @PathVariable("id") short id) {
        oder_detailService.update(oder_detailDto, id);
        return ResponseEntity.ok().build();
    }
}