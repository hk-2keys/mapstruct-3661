package com.github.hk2keys.mapstruct3661.module2;

import com.github.hk2keys.mapstruct3661.module1.SourceNestedRecord;
import com.github.hk2keys.mapstruct3661.module1.SourceRootRecord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecordInterfaceIssueMapperTest {

    RecordInterfaceIssueMapper mapper;
    SourceRootRecord source;
    TargetRootRecord target;

    @BeforeEach
    void setUp() {
        mapper = Mappers.getMapper(RecordInterfaceIssueMapper.class);
        source = new SourceRootRecord(new SourceNestedRecord("field"));
        target = new TargetRootRecord(new TargetNestedRecord("field"));
    }

    @Test
    void testMap_Source() {
        assertEquals(target, mapper.map(source));
    }

    @Test
    void testMap_Target() {
        assertEquals(source, mapper.map(target));
    }
}
