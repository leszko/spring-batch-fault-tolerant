package com.summercoding.spring.faulttolerant;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

@Slf4j
public class Writer implements ItemWriter<Element> {
    @Override
    public void write(List<? extends Element> items) throws Exception {
        log.info("Writing elements: {}", items);
    }
}
