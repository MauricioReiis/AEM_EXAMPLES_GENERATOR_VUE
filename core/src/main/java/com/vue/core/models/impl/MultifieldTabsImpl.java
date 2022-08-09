/*
 * ***********************************************************************
 * SPA Vue Project CONFIDENTIAL
 * ___________________
 *
 * Copyright 2022 SPA Vue Project.
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property
 * of SPA Vue Project and its suppliers, if any. The intellectual and
 * technical concepts contained herein are proprietary to SPA Vue Project
 * and its suppliers and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from SPA Vue Project.
 * ***********************************************************************
 */

package com.vue.core.models.impl;

import java.util.Collections;
import java.util.List;
import com.adobe.acs.commons.models.injectors.annotation.ChildResourceFromRequest;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.vue.core.models.MultifieldTabs;
import com.vue.core.models.multifieldTwoModel;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {
    SlingHttpServletRequest.class
}, adapters = {
    MultifieldTabs.class,
    ComponentExporter.class
}, resourceType = "vue/components/multifield-tabs")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class MultifieldTabsImpl
    implements MultifieldTabs
{

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private List<String> multifieldOne;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private List<multifieldTwoModel> multifieldTwo;
    @SlingObject
    private Resource resource;

    @Override
    public List<String> getMultifieldOne() {
        return multifieldOne != null ? Collections.unmodifiableList(multifieldOne) : null;
    }

    @Override
    public List<multifieldTwoModel> getMultifieldTwo() {
        return multifieldTwo != null ? Collections.unmodifiableList(multifieldTwo) : null;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}
