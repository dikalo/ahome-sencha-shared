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
package com.ait.toolkit.sencha.shared.client.util;

/**
 * A collection of useful static methods to deal with strings
 */
public class StringUtil {

    private StringUtil() {
    }

    /**
     * Capitalize the given string
     * 
     * @param value
     * @return
     */
    public static native String capitalize(String value)/*-{
		return $wnd.Ext.String.capitalize(value);
    }-*/;

    /**
     * Truncate a string and add an ellipsis ('...') to the end if it exceeds
     * the specified length
     * 
     * @param value
     * @param length
     * @param word
     * @return
     */
    public static native String ellipsis(String value, double length, boolean word)/*-{
		return $wnd.Ext.String.ellipsis(value, length, word);
    }-*/;

    /**
     * Escapes the passed string for ' and \
     * 
     * @param value
     * @return
     */
    public static native String escape(String value)/*-{
		return $wnd.Ext.String.escape(value);
    }-*/;

    /**
     * Escapes the passed string for ' and \
     * 
     * @param value
     * @return
     */
    public static native String escapeRegex(String value)/*-{
		return $wnd.Ext.String.escapeRegex(value);
    }-*/;

    /**
     * Allows you to define a tokenized string and pass an arbitrary number of
     * arguments to replace the tokens. Each token must be unique, and must
     * increment in the format {0}, {1}, etc.
     * 
     * @param String
     * @param value1
     * @param value2
     * @return
     */
    public static native String format(String string, String value1, String value2)/*-{
		return $wnd.Ext.String.format(string, value1, value2);
    }-*/;

    /**
     * Convert certain characters (&, <, >, and ") from their HTML character
     * equivalents.
     * 
     * @param value
     * @return
     */
    public static native String htmlDecode(String value)/*-{
		return $wnd.Ext.String.htmlDecode(value);
    }-*/;

    /**
     * Convert certain characters (&, <, >, and ") to their HTML character
     * equivalents for literal display in web pages.
     * 
     * @param value
     * @return
     */
    public static native String htmlEncode(String value)/*-{
		return $wnd.Ext.String.htmlEncode(value);
    }-*/;

    /**
     * Pads the left side of a string with a specified character. This is
     * especially useful for normalizing number and date strings
     * 
     * @param String
     * @param size
     * @param character
     * @return
     */
    public static native String leftPad(String string, double size, String character)/*-{
		return $wnd.Ext.String.leftPad(string, size, character);
    }-*/;

    /**
     * Pads the left side of a string with a specified character. This is
     * especially useful for normalizing number and date strings
     * 
     * @param string
     * @param size
     * 
     * @return
     */
    public static native String leftPad(String string, double size)/*-{
		return $wnd.Ext.String.leftPad(string, size);
    }-*/;

    /**
     * Returns a string with a specified number of repititions a given string
     * pattern. The pattern be separated by a different string.
     * 
     * @param pattern
     * @param count
     * @param sep
     * @return
     */
    public static native String repeat(String pattern, double count, String sep)/*-{
		return $wnd.Ext.String.repeat(pattern, count, sep);
    }-*/;

    /**
     * Returns a string with a specified number of repititions a given string
     * pattern. The pattern be separated by a different string.
     * 
     * @param pattern
     * @param count
     * @return
     */
    public static native String repeat(String pattern, double count)/*-{
		return $wnd.Ext.String.repeat(pattern, count);
    }-*/;

    /**
     * Utility function that allows you to easily switch a string between two
     * alternating values. The passed value is compared to the current string,
     * and if they are equal, the other value that was passed in is returned. If
     * they are already different, the first value passed in is returned. Note
     * that this method returns the new value but does not change the current
     * string.
     * 
     * @param string
     * @param value
     * @param other
     * @return
     */
    public static native String toggle(String string, String value, String other)/*-{
		return $wnd.Ext.String.toggle(string, value, other);
    }-*/;

    /**
     * Trims whitespace from either end of a string, leaving spaces within the
     * string intact
     * 
     * @param value
     * @return
     */
    public static native String trim(String value)/*-{
		return $wnd.Ext.String.trim(value);
    }-*/;

    /**
     * Appends content to the query string of a URL, handling logic for whether
     * to place a question mark or ampersand.
     * 
     * @param value
     * @return
     */
    public static native String urlAppend(String value)/*-{
		return $wnd.Ext.String.urlAppend(value);
    }-*/;

}
