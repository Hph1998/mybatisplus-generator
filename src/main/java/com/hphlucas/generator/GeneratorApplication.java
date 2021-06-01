package com.hphlucas.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.hphlucas.generator.config.Config;
import com.hphlucas.generator.util.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringBootConfiguration;

@Slf4j
@SpringBootConfiguration
public class GeneratorApplication {

    /**
     * 生成 controller、dto、entity、mapper、xml、service、serviceImpl
     * @param args
     */
    public static void main(String[] args) {
        DbType dbType = Config.DB_TYPE;
        String dbUrl = Config.DB_URL;
        String username = Config.USERNAME;
        String password = Config.PASSWORD;
        String driver = Config.DRIVER;
        // 表前缀，生成的实体类，不含前缀
        String[] tablePrefixes = Config.TABLE_PREFIXES;
        // 表名，为空，生成所有的表
        String[] tableNames = Config.TABLE_NAMES;
        // 字段前缀
        String[] fieldPrefixes = Config.FIELD_PREFIXES;
        // 剔除公共字段
        String[] commonField = Config.COMMON_FIELD;
        // 基础包名
        String packageName = Config.PACKAGE_NAME;
        CommonUtils.execute(dbType, dbUrl, username, password, driver, tablePrefixes, tableNames, packageName, fieldPrefixes, commonField);
    }

}
