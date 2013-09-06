/**
* Copyright 2013 IPSoft Inc.
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*   http://www.apache.org/licenses/LICENSE-2.0
*   
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.clearnlp.dictionary;

/**
 * @since 1.0.0
 * @author Jinho D. Choi ({@code jdchoi77@gmail.com})
 */
public class DTTokenizer implements IDictionary
{
	static public final String PATH = PATH_ROOT + "tokenizer/";
	
	static public final String ABBREVIATIONS = PATH + "abbreviations.txt";
	static public final String COMPOUNDS     = PATH + "compounds.txt";
	static public final String EMOTICONS     = PATH + "emoticons.txt";
	static public final String HYPHENS       = PATH + "hyphens.txt";
	static public final String NON_UTF8      = PATH + "non-utf8.txt";
	static public final String UNITS         = PATH + "units.txt";
}
