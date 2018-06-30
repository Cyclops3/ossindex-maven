/*
 * Copyright (c) 2018-present Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.sonatype.ossindex.maven.testsuite

/**
 * Maven 3.3 testsuite.
 */
class Maven33IT
    extends TestsuiteSupport
{
  Maven33IT() {
    super('3.3.9')
    overrides = [
        // send requests to dev instance
        'ossindex.baseUrl': 'http://10.20.5.63:8080/'
    ]
  }
}
