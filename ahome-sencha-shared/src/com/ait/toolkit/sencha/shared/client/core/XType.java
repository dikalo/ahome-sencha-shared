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
package com.ait.toolkit.sencha.shared.client.core;

/**
 * Class to enumerate all the Touch xtype fields.
 */
public enum XType {
	AUDIO("audio"), ACTONSHEET("actionsheet"), BOX("box"), BUTTON("button"), CHART(
			"chart"), CALENDAR("calendar"), CHECKBOX_FIELD("checkboxfield"), CAROUSEL(
			"carousel"), COMPONENT("component"), CONTAINER("container"), CROSSCUT(
			"crosscut"), DATAVIEW("dataview"), DATAITEM("dataitem"), DATEPICKER(
			"datepicker"), DATEPICKER_FIELD("datepickerfield"), DRAW("draw"), EMAIL_FIELD(
			"emailfield"), FIELD("field"), FIELDSET("fieldset"), FORMPANEL(
			"formpanel"), GWT_WIDGET("gwtwidget"), HIDDEN_FIELD("hiddenfield"), IMAGE(
			"image"), INPUT_FIELD("input"), LABEL("label"), LIST("list"), LOADMASK(
			"loadmask"), MAP("map"), MASK("mask"), MEDIA("media"), NAVIGATION_VIEW(
			"navigationview"), NESTEDLIST("nestedlist"), NUMBER_FIELD(
			"numberfield"), PANEL("panel"), PASSWORD_FIELD("passwordfield"), PICKER(
			"picker"), POLAR_CHART("polar"), RADIO_FIELD("radiofield"), RATING(
			"rating"), SEARCH_FIELD("searchfield"), SEGMENTED_BUTTON(
			"segmentedbutton"), SELECT_FIELD("selectfield"), SHEET("sheet"), PROGRESS_INDICATOR(
			"progressindicator"), MENU("menu"), GRID("grid"), SLIDER_FIELD(
			"sliderfield"), SPACER("spacer"), SPINNER_FIELD("spinnerfield"), SPACE_FILLING_CHART(
			"spacefilling"), TAB_PANEL("tabpanel"), TEXT_FIELD("textfield"), TEXTAREA_FIELD(
			"textareafield"), TEXTAREA_INPUT_FIELD("textareainput"), TITLEBAR(
			"titlebar"), TOGGLE_FIELD("togglefield"), TOOLBAR("toolbar"), URL_FIELD(
			"urlfield"), VIDEO("video"), TITLE("title"), TOUCH_GRID(
			"touchgridpanel"), WIDGET_COMPONENT("widgetComponent"), TABAR(
			"tabbar"), BUTTON_GROUP("buttongroup"), CYCLE("cycle"), COLOR_PICKER(
			"colorpicker"), HEADER("header"), HEADER_CONTAINER(
			"headercontainer"), SPLIT_BUTTON("splitbutton"), TIP("tip"), TEXT(
			"text"), TOOLBAR_FILL("tbfill"), TOOLBAR_SEPARATOR("tbseparator"), TOOLTIP(
			"tooltip"), TOOL("tool"), FLASH("flash"), COLOR_MENU("colormenu"), DATE_MENU(
			"datemenu"), MENU_ITEM("menuitem"), MENU_CHECK_ITEM("menucheckitem"), MENU_SEPARATOR(
			"menuseparator"), TABLE("tablepanel"), GRIDVIEW("gridview"), VIEWPORT(
			"viewport"), GRID_PANEL("gridpanel"), PROPERTY_GRID("propertygrid"), ACTION_COLUMN(
			"actioncolumn"), BOOLEAN_COLUM("booleancolumn"), TEMPLATE_COLUMN(
			"templatecolumn"), NUMBER_COLUM("numbercolumn"), DATE_COLUMN(
			"datecolumn"), ROW_NUMEBERER_COLUMN("rownumberer"), TEXTFIELD(
			"textfield"), TIMEPICKER("timepicker"), TABPANEL("tabpanel"), TAB_BAR(
			"tabbar"), CHECK_COLUMN("checkcolumn"), CHECK_BOX("checkbox"), TAB(
			"tab"), MULTI_SLIDER("multislider"), SLIDER("slider"), WINDOW(
			"window"), VIEW("view"), GMAP_PANEL("gmappanel"), TABLE_VIEW(
			"tableview"), TREE_PANEL("treepanel"), TREE_VIEW("treeview");

	private String value;

	private XType(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
