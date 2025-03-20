/*
 * MIT License
 *
 * Copyright (c) 2025 Russ Moul
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/**
 * The Interpreter pattern, as described in the Gang of Four (GoF) book, is a behavioral design pattern
 * used to define a grammar for a language and provide an interpreter to process sentences in that
 * language. It is particularly useful when dealing with domain-specific languages (DSLs) or symbolic
 * processing, such as mathematical expressions, SQL parsing, or scripting engines. The pattern typically
 * involves defining an AbstractExpression interface and multiple ConcreteExpression classes that
 * represent different elements of the grammar. A Context object may be used to store global information
 * during interpretation. While flexible, the pattern is best suited for simple grammars, as it can become
 * complex and inefficient for large or intricate languages.
 */
package gof_patterns.interpreter;