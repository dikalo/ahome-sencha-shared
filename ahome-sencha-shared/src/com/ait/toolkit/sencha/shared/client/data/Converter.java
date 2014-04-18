/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.sencha.shared.client.data;

/**
 * Converter that can be used to format the incoming data before processing it
 * by the {@link Reader}.
 */
public interface Converter {

    /**
     * Format incoming data before processing it by the Reader.
     * 
     * @param data
     *            raw data
     * @return processed data
     */
    String format(String data);
}
