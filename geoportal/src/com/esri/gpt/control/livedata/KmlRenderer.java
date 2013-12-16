/* See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * Esri Inc. licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.esri.gpt.control.livedata;

/**
 * KML Renderer.
 */
/*packge*/ abstract class KmlRenderer extends MapBasedRenderer {

  protected abstract String getProxyUrl();

  protected abstract String getUrl();

  @Override
  protected String newLayerDeclaration() {
    return "new esri.gpt.layers.KmlLayer(\"" +getUrl()+ "\",\"" +getProxyUrl()+ "\",geometryService)";
  }

  @Override
  protected String initializeNewLayer() {
    return "node.liveDataMap.addLayer(node.liveDataLayer);\r\n"+
           "node.liveDataLayer.init(node.liveDataMap);";
  };

  @Override
  protected String finalizeNewLayer() {
    return "dojo.connect(node.liveDataMap,\"onLoad\",null,function(map){" +
              "map.addLayer(node.liveDataLayer);"+
              "node.liveDataLayer.init(map);" +
           "});";
  };

  @Override
  public String toString() {
    return KmlRenderer.class.getSimpleName() + "("+getUrl()+")";
  }

}