/*-
 * #%L
 * OBKV Table Client Framework
 * %%
 * Copyright (C) 2021 OceanBase
 * %%
 * OBKV Table Client Framework is licensed under Mulan PSL v2.
 * You can use this software according to the terms and conditions of the Mulan PSL v2.
 * You may obtain a copy of Mulan PSL v2 at:
 *          http://license.coscl.org.cn/MulanPSL2
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT,
 * MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PSL v2 for more details.
 * #L%
 */

package com.alipay.oceanbase.rpc.exception;

public class ObTableUnitMigrateException extends ObTableException {

    /**
     * Ob table unit migrate exception.
     */
    public ObTableUnitMigrateException() {
    }

    /**
     * Ob table unit migrate exception.
     */
    public ObTableUnitMigrateException(int errorCode) {
        super(errorCode);
    }

    /**
     * Ob table unit migrate exception.
     */
    public ObTableUnitMigrateException(String message, int errorCode) {
        super(message, errorCode);
    }

    /**
     * Ob table unit migrate exception.
     */
    public ObTableUnitMigrateException(String message) {
        super(message);
    }

    /**
     * Ob table unit migrate exception.
     */
    public ObTableUnitMigrateException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Ob table unit migrate exception.
     */
    public ObTableUnitMigrateException(Throwable cause) {
        super(cause);
    }

    /**
     * Is need refresh table entry.
     */
    public boolean isNeedRefreshTableEntry() {
        return true;
    }
}
