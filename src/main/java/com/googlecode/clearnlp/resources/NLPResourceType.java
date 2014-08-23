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

/**
 * The different resource types available in the package
 */
public enum NLPResourceType {
  /**
   * The dictionary resource type
   */
  DICTIONARY("dictionary"),
  /**
   * The tokenizer resource type
   */
  TOKENIZER("tokenizer");

  // Store the root directory for the resource type
  private String rootDir;

  NLPResourceType(String rootDir) {
    this.rootDir = rootDir;
  }

  /**
   * Make the string more use friendly
   */
  @Override
  public String toString() {
    return rootDir;
  }
}
