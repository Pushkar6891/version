package com.dailycodebuffer.transaction.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestVO {
    private String empName;
    private String email;
    private String departmentName;
}
