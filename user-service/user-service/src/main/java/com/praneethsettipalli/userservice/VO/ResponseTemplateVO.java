package com.praneethsettipalli.userservice.VO;

import com.praneethsettipalli.userservice.entity.UserObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private UserObject user;
    private Department department;
}
