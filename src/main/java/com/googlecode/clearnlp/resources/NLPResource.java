/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 *
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.  See the License for the specific language governing permissions and limitations
 * under the License. 
 */

package com.googlecode.clearnlp.resources;

import java.io.InputStream;
import java.util.Locale;

/**
 * Main class to allow access to various NLP resource objects within the the package without having
 * to parse the associated zip and doing a manual extraction.
 */
public class NLPResource {
  /**
   * Return the resource as stream
   *
   * @param type the resource type
   * @param name the resource name
   * @parm locale the locale to use
   *
   * @return the stream to read resource from or null
   */
  public static InputStream resource(NLPResourceType type, String name, Locale locale) {
    return NLPResource.class.getResourceAsStream("/" + type.toString() + "/" +
                                                 locale.getLanguage() + "/" + name);
  }
}
