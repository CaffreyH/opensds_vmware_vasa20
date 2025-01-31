/*
 * // Copyright 2019 The OpenSDS Authors.
 * //
 * // Licensed under the Apache License, Version 2.0 (the "License"); you may
 * // not use this file except in compliance with the License. You may obtain
 * // a copy of the License at
 * //
 * //     http://www.apache.org/licenses/LICENSE-2.0
 * //
 * // Unless required by applicable law or agreed to in writing, software
 * // distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * // WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * // License for the specific language governing permissions and limitations
 * // under the License.
 *
 */

package org.opensds.vasa.base.bean.terminal;

import org.opensds.platform.common.bean.commu.BaseJsonBean;

public class ResError extends BaseJsonBean {
    private int id;

    private int code;

    private String[] params;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String[] getParams() {
        if (null != params) {
            return params.clone();
        } else {
            return new String[0];
        }
    }

    public void setParams(String[] params) {
        if (null != params) {
            this.params = params.clone();
        }
    }
}
