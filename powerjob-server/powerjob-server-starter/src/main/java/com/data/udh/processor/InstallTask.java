package com.data.udh.processor;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InstallTask extends BaseUdhTask {


    public InstallTask(UdhTaskContext taskContext) {
        super(taskContext);
    }

    @Override
    public void internalExecute() {
        // 查询服务实例需要创建的目录

        // ssh执行创建目录

        // todo 日志采集的相关执行
        System.out.println(taskContext.commandTaskId + ":模拟执行。。。。");
        if (taskContext.commandTaskId == 10) {
            int a = 1 / 0;
        }

    }
}
