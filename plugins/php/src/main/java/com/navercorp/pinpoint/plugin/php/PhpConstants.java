/**
 * Copyright 2014 NAVER Corp.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.navercorp.pinpoint.plugin.php;

import static com.navercorp.pinpoint.common.trace.ServiceTypeProperty.*;

import com.navercorp.pinpoint.common.trace.AnnotationKey;
import com.navercorp.pinpoint.common.trace.AnnotationKeyFactory;
import com.navercorp.pinpoint.common.trace.AnnotationKeyMatchers;
import com.navercorp.pinpoint.common.trace.AnnotationKeyProperty;
import com.navercorp.pinpoint.common.trace.ServiceType;
import com.navercorp.pinpoint.common.trace.ServiceTypeFactory;

/**
 * @author chenguoxi
 *
 */
public final class PhpConstants {
    private PhpConstants() {
    }

    public static final ServiceType PHP = ServiceTypeFactory.of(1921, "PHP", RECORD_STATISTICS);
    public static final ServiceType PHP_DB_CLIENT = ServiceTypeFactory.of(2921, "PHP_DB_CLIENT");
    public static final ServiceType PHP_CACHE_CLIENT = ServiceTypeFactory.of(8921, "PHP_CACHE_CLIENT");
    public static final ServiceType PHP_RPC_CLIENT = ServiceTypeFactory.of(9921, "PHP_METHOD");
    public static final ServiceType PHP_OTHERS = ServiceTypeFactory.of(7521, "PHP_OTHERS");

    public static final AnnotationKey PHP_FUNCTION_RETURN = AnnotationKeyFactory.of(921, "php.return", AnnotationKeyProperty.VIEW_IN_RECORD_SET);

}
