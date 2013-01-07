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
package htmlexport.gui;

/**
 * Abstraction to avoid dependency on {@link com.intellij.openapi.ui.TextFieldWithBrowseButton}.
 * <br/>
 *
 * User: dima
 * Date: Dec 15, 2008
 * Time: 12:57:18 AM
 */
interface PathSelectionPanel {
    void setText(String text);

    String getText();

    void setEnabled(boolean isEnabled);
}
