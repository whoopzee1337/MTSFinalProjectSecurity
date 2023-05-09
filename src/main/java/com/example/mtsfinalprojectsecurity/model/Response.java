package com.example.mtsfinalprojectsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataWrapper {
    private ErrorResponse error;
    private Data data;
}
