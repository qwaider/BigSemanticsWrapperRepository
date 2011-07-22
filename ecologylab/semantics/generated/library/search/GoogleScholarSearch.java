package ecologylab.semantics.generated.library.search;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.generated.library.search.GoogleScholarSearchResult;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  GoogleScholarSearch.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/22/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * The google Search class
 */ 
@simpl_inherit
public class GoogleScholarSearch extends Document
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("google_scholar_search_result") @mm_name("search_results")	private List<GoogleScholarSearchResult> searchResults;

	public GoogleScholarSearch()
	{ }

	public GoogleScholarSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<GoogleScholarSearchResult> getSearchResults()
	{
		return searchResults;
	}

	public void setSearchResults(List<GoogleScholarSearchResult> searchResults)
	{
		this.searchResults = searchResults;
	}
}
