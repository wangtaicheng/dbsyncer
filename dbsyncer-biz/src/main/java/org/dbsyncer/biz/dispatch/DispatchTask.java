/**
 * DBSyncer Copyright 2020-2025 All Rights Reserved.
 */
package org.dbsyncer.biz.dispatch;

import org.dbsyncer.biz.enums.DispatchTaskEnum;

/**
 * @Author 穿云
 * @Version 1.0.0
 * @Date 2025-06-12 23:54
 */
public interface DispatchTask extends Runnable {

    /**
     * 唯一任务id
     */
    String getUniqueId();

    DispatchTaskEnum getType();

    void destroy();

}