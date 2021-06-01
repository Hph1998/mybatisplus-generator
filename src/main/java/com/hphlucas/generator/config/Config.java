package com.hphlucas.generator.config;

import com.baomidou.mybatisplus.annotation.DbType;

public class Config {

    /** 包名：controller */
    public static final String PACKAGE_NAME_CONTROLLER = "controller";

    /** 包名：service */
    public static final String PACKAGE_NAME_SERVICE = "service";

    /** 包名：service.impl */
    public static final String PACKAGE_NAME_SERVICE_IMPL = "service.impl";

    /** 包名：entity */
    public static final String PACKAGE_NAME_MODEL = "entity";

    /** 包名：mapper */
    public static final String PACKAGE_NAME_DAO = "mapper";

    /** 目录名：dto */
    public static final String DIR_NAME_DTO = "dto";

    /** 文件名后缀：Model */
    public static final String FILE_NAME_MODEL = "%s";

    /** 文件名后缀：Mapper */
    public static final String FILE_NAME_DAO = "%sMapper";

    /** 文件名后缀：xml */
    public static final String FILE_NAME_XML = "%sMapper";

    /** MP开头，Service结尾 */
    public static final String FILE_NAME_SERVICE = "%sService";

    /** 文件名后缀：ServiceImpl */
    public static final String FILE_NAME_SERVICE_IMPL = "%sServiceImpl";

    /** 文件名后缀：Controller */
    public static final String FILE_NAME_CONTROLLER = "%sController";

    /** 逻辑删除字段 */
    public static final String FIELD_LOGIC_DELETE_NAME = "delete_status";


    /** 乐观锁字段名 */
    public static final String FIELD_VERSION_NAME = "version";

    /** 模板引擎。velocity / freemarker / beetl */
    public static final String TEMPLATE_ENGINE = "freemarker";

    /** 是否支持Swagger，默认不支持 */
    public static final Boolean SWAGGER_SUPPORT = false;

    /** 表前缀，生成的实体类，不含前缀 */
    public static final String[] TABLE_PREFIXES = {};

    /** 字段前缀 */
    public static final String[] FIELD_PREFIXES = {};

    // 一般情况只需要改动的配置项

    /** 作者 */
    public static final String AUTHOR = "Lucas";

    /** 基础包名 */
    public static final String PACKAGE_NAME = "com.example.db";

    /** 生成文件的输出目录 */
    public static String PROJECT_PATH = System.getProperty("user.dir");

    /** 输出目录 */
    public static final String OUTPUT_DIR = PROJECT_PATH + "/src/main/java";

    /** xml输出目录 */
    public static final String OUTPUT_XML = PROJECT_PATH + "/src/main/resources/mapper/db";

    /** 数据库类型 */
    public static final DbType DB_TYPE = DbType.MYSQL;

    /** 数据库链接 */
    public static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/jf-platform?useOldAliasMetadataBehavior=true&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=convertToNull&useSSL=false&characterEncoding=gbk&allowPublicKeyRetrieval=true";

    /** 数据库用户名 */
    public static final String USERNAME = "root";

    /** 数据库密码 */
    public static final String PASSWORD = "root";

    /** 数据库驱动 */
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    /** 表名，为空，生成所有的表 */
    public static final String[] TABLE_NAMES = {"sys_menu"};

    /** 剔除公共字段 驼峰命名 */
    public static final String[] COMMON_FIELD = {"remark", "createdByCode", "createdByName", "createdDate", "updatedByCode", "updatedByName", "updatedDate"};

}
