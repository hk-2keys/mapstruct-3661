package com.github.hk2keys.mapstruct3661.module2;

import com.github.hk2keys.mapstruct3661.module1.SourceRootRecord;
import org.mapstruct.Mapper;

@Mapper
public interface RecordInterfaceIssueMapper {

    TargetRootRecord map(SourceRootRecord source);

    SourceRootRecord map(TargetRootRecord target);
}
