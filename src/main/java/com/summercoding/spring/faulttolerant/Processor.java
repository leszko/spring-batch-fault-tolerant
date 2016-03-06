package com.summercoding.spring.faulttolerant;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;


@Slf4j
public class Processor implements ItemProcessor<Element, Element> {

    @Override
    public Element process(final Element element) throws Exception {
        log.info("Processing element: {}", element);
        return element;
    }
}
