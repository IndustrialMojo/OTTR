package com.industrialmojo.http;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class JsoupTest {

	private static final String FORM_URL = "https://www.usaswimming.org/Home/times/individual-times-search";
	private static final String ACTION_URL = "https://www.usaswimming.org/Home/times/individual-times-search/ListTimesForFilter";

	private static final String FIELD_FIRST = "FirstName";
	private static final String FIELD_LAST = "LastName";

	private static final String VALUE_FIRST = "adeline";
	private static final String VALUE_LAST = "bennett";

	private static final String RVT = "7weO-0XuHwn9Q00b4mD-29L3Ly4lbLde-n7TOm2vPNe-LEUyMuhNOix0qTwI0D-2oixOyKmHHOsVJ5mPq4JtPZw1aVA1:biDQW44JP64pnRjnSLs_cAAFXEs37f9InryRuyvHvXT0d8zB-i2LP6nYKP_AGX18RqH8_5gITRdZj7wUw7GZWxDAgzk1";

	public void doit() throws Exception {

		Connection.Response searchForm = Jsoup.connect(FORM_URL).method(Connection.Method.GET).execute();

		for (String yyy : searchForm.cookies().keySet()) {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println(yyy + " -- " + searchForm.cookie(yyy));
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

		}

		// Document document = Jsoup.connect(ACTION_URL)
		// .data(FIELD_FIRST, VALUE_FIRST)
		// .data(FIELD_LAST, VALUE_LAST)
		// .cookies(searchForm.cookies())
		// .headers(searchForm.headers())
		// .header("RequestVerificationToken", RVT)
		// .post();
		//
		// System.out.println(document);

		Document document = Jsoup.connect(ACTION_URL)
				.data("divId", "UsasTimeSearchIndividual_Index_Div_1")
				.data("FirstName", "adeline", "LastName", "bennett")
//				.data("SelectedDateType", "DateRange")
//				.data("StartDate", "")
//				.data("EndDate", "")
//				.data("DateRangeID", "-1")
//				.data("SelectedEventType", "All")
//				.data("DSC%5BDistanceID%5D", "0")
//				.data("DSC%5BStrokeID%5D", "0")
//				.data("DSC%5BCourseID%5D", "0")
//				.data("SelectedAgeFilter", "All")
//				.data("StartAge", "All")
//				.data("EndAge", "All")
//				.data("OrderBy", "EventSortOrder")
				.cookies(searchForm.cookies())
				.headers(searchForm.headers())
				.header("RequestVerificationToken", RVT)
				.post();

		System.out.println(document);

		// <form action="" method="post" data-role="validator" novalidate="novalidate">
		//
		// <input autofocus="autofocus" class="k-textbox k-valid valid" data-val="true"
		// data-val-required="First name is required"
		// id="UsasTimeSearchIndividual_Index_Div_1FirstName" name="FirstName">
		//
		// <input class="k-textbox k-valid valid" data-val="true"
		// data-val-required="Last name is required"
		// id="UsasTimeSearchIndividual_Index_Div_1LastName" name="LastName">

	}

}