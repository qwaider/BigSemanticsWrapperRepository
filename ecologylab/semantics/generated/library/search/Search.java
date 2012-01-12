package ecologylab.semantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.search.SearchResult;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Search extends Document
{
	@simpl_collection("search_result")
	@simpl_nowrap
	@mm_name("search_results")
	private List<SearchResult> searchResults;

	public Search()
	{ }

	public Search(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<SearchResult> getSearchResults()
	{
		return searchResults;
	}

	public void setSearchResults(List<SearchResult> searchResults)
	{
		this.searchResults = searchResults;
	}
}