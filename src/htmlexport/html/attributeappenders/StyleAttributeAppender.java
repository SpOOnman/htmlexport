/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package htmlexport.html.attributeappenders;

import com.intellij.openapi.editor.markup.TextAttributes;
import htmlexport.html.css.TextAttributesToStyleConverter;

/**
 * User: dima
 * Date: Dec 27, 2008
 * Time: 10:25:18 PM
 */
public class StyleAttributeAppender implements AttributeAppender {
    @Override
    public void appendAttributeTo(final StringBuilder output, final TextAttributes textAttributes) {
        TextAttributesToStyleConverter converter = new TextAttributesToStyleConverter(textAttributes);
        String style = converter.foreground() + converter.background() + converter.fontWeight() + converter.fontStyle();
        output.append(" style=\"").append(style).append("\"");
    }
}
