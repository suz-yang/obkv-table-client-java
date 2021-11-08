# OBKV Table Client
OBKV Table Client is Java Library that can be used to access table data from [OceanBase](https://github.com/oceanbase/oceanbase) storage layer. Its access method is different from JDBC, it skips the SQL parsing layer, so it has significant performance advantage.

## Quick start

Create table in the OceanBase database:

``` sql
CREATE TABLE IF NOT EXISTS `test_varchar_table` (
    `c1` varchar(20) NOT NULL,
    `c2` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`c1`)
);
```

Import the dependency for your maven project:
``` xml
<dependency>
    <groupId>com.oceanbase</groupId>
    <artifactId>obkv-table-client</artifactId>
    <version>0.1.0</version>
</dependency>
```

The code demo:
``` java
    // 1. initail ObTableClient
    ObTableClient obTableClient = new ObTableClient();
    obTableClient.setFullUserName("full_user_name");
    obTableClient.setParamURL("param_url");
    obTableClient.setPassword("password");
    obTableClient.setSysUserName("sys_user_name");
    obTableClient.setEncSysPassword("sys_sys_password");
    client.init();

    // 2. single execute
    // return affectedRows
    client.insert("test_varchar_table", "foo", new String[] { "c2" }, new String[] { "bar" });
    // return Map<String, Object>
    client.get("test_varchar_table", "foo", new String[] { "c2" });
    // return affectedRows
    client.delete("test_varchar_table", "foo");

    // 3. batch execute
    TableBatchOps batchOps = client.batch("test_varchar_table");
    batchOps.insert("foo", new String[] { "c2" }, new String[] { "bar" });
    batchOps.get("foo", new String[] { "c2" });
    batchOps.delete("foo");
    
    List<Object> results = batchOps.execute();
    // the results include 3 item: 1. affectedRows; 2. Map; 3. affectedRows.
```
**NOTE:**
param_url is generated by ConfigServer (link TODO).

## Documentation

- English [link TODO]
- Simplified Chinese (简体中文) [link TODO]

## Licencing

OBKV Table Client is under [MulanPSL - 2.0](http://license.coscl.org.cn/MulanPSL2) licence. You can freely copy and use the source code. When you modify or distribute the source code, please obey the MulanPSL - 2.0 licence.

## Contributing

Contributions are warmly welcomed and greatly appreciated. Here are a few ways you can contribute:

- Raise us an issue [link TODO].
- Submit Pull Requests. For details, see [How to contribute](CONTRIBUTING.md).

## Support

In case you have any problems when using OceanBase Database, welcome reach out for help:

- GitHub Issue [link TODO]
- Official forum [link TODO]
- Knowledge base [link TODO]

