package com.summercoding.spring.faulttolerant;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.core.io.ClassPathResource;

@Slf4j
public class Reader extends FlatFileItemReader<Element> {
    public Reader() {
        super();

        this.setResource(new ClassPathResource("input_data.csv"));

        this.setLineMapper(new DefaultLineMapper<Element>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(new String[]{"number", "text"});
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<Element>() {{
                setTargetType(Element.class);
            }});
        }});
    }

    @Override
    protected Element doRead() throws Exception {
        Element result = super.doRead();

        log.info("Reading element: {}", result);

        return result;
    }
}
