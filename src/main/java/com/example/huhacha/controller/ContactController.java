package com.example.huhacha.controller;

import com.example.huhacha.DTO.ContactDto;
import com.example.huhacha.entitis.Contact;
import com.example.huhacha.mapper.ContactMapper;
import com.example.huhacha.service.ContactService;
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

@RequestMapping("/contact")
@RestController
@Slf4j
@Api("contact")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated ContactDto contactDto) {
        contactService.save(contactDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactDto> findById(@PathVariable("id") short id) {
        ContactDto contact = contactService.findById(id);
        return ResponseEntity.ok(contact);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") short id) {
        Optional.ofNullable(contactService.findById(id)).orElseThrow(() -> {
            log.error("Unable to delete non-existent data！");
            return new ResourceNotFoundException("a");
        });
        contactService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<ContactDto>> pageQuery(ContactDto contactDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<ContactDto> contactPage = contactService.findByCondition(contactDto, pageable);
        return ResponseEntity.ok(contactPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated ContactDto contactDto, @PathVariable("id") short id) {
        contactService.update(contactDto, id);
        return ResponseEntity.ok().build();
    }
}