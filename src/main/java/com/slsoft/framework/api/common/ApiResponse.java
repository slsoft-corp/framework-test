package com.slsoft.framework.api.common;

public record ApiResponse<T>(int message, T data) {
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(200, data);
    }
    public static <T> ApiResponse<T> error(int code, T data) {
        return new ApiResponse<>(code, data);
    }
}