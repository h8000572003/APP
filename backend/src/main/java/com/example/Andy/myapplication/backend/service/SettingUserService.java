package com.example.Andy.myapplication.backend.service;

import com.example.Andy.myapplication.backend.domain.SettingUserDTO;
import com.example.Andy.myapplication.backend.exception.TaskBuiness;

/**
 * Created by Andy on 2015/12/2.
 */
public interface SettingUserService {
    /**
     * 查詢
     *
     * @param dto

     * @throws TaskBuiness
     */
    void query(SettingUserDTO dto) throws TaskBuiness;

    /**
     * 修改資料
     * @param dto

     * @throws TaskBuiness
     */
    void modify(SettingUserDTO dto) throws TaskBuiness;

    /**
     * 刪除
     * @param dto

     * @throws TaskBuiness
     */
    void delete(SettingUserDTO dto) throws TaskBuiness;
}
