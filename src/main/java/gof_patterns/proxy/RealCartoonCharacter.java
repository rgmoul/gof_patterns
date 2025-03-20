/*
 * MIT License
 *
 * Copyright (c) 2025 Symbiont Software
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

package gof_patterns.proxy;

import java.awt.Image;

/**
 * The real cartoon character - RealSubject in the Proxy pattern.
 *
 * @param name  The character's name.
 * @param image The character's image.
 */
public record RealCartoonCharacter(String name, Image image) implements CartoonCharacter {

    /**
     * Constructor.
     *
     * @param name  the character's name
     * @param image the character's image
     */
    public RealCartoonCharacter {
    }

    /**
     * Gets the character's name.
     *
     * @return the character's name
     */
    @Override
    public String name() {
        return name;
    }

    /**
     * Gets the character's image.
     *
     * @return the character's image
     */
    @Override
    public Image image() {
        return image;
    }

}
