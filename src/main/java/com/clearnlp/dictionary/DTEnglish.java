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
public class DTEnglish implements IDictionary
{
	static public final String PATH = PATH_ROOT + "english/";
	
	static public final String ABBR_RULE  = PATH + "abbr.rule";
	static public final String ADJ_EXC    = PATH + "adj.exc";
	static public final String ADJ_BASE   = PATH + "adj.txt";
	static public final String ADV_EXC    = PATH + "adv.exc";
	static public final String ADV_BASE   = PATH + "adv.txt";
	static public final String NOUN_EXC   = PATH + "noun.exc";
	static public final String NOUN_BASE  = PATH + "noun.txt";
	static public final String VERB_EXC   = PATH + "verb.exc";
	static public final String VERB_BASE  = PATH + "verb.txt";
	static public final String VERB_TENSE = PATH + "verb.tense";
	
	static public final String CARDINAL = PATH + "cardinal.txt";
	static public final String ORDINAL  = PATH + "ordinal.txt";
}
