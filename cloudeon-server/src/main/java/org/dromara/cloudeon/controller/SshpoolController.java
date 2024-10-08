/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.dromara.cloudeon.controller;

import org.dromara.cloudeon.dto.HostSshPoolMetrics;
import org.dromara.cloudeon.dto.ResultDTO;
import org.dromara.cloudeon.service.SshPoolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/sshpool")
public class SshpoolController {

    @Resource
    private SshPoolService sshPoolService;

    @GetMapping("/metrics")
    public ResultDTO<List<HostSshPoolMetrics>> metrics() {
        List<HostSshPoolMetrics> metrics = sshPoolService.metrics();

        return ResultDTO.success(metrics);
    }
}
