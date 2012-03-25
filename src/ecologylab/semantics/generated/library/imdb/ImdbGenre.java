package ecologylab.semantics.generated.library.imdb;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.imdb.ImdbTitle;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *IMDB genre
 */ 
@simpl_inherit
public class ImdbGenre extends CompoundDocument
{
	@simpl_collection("imdb_title")
	@mm_name("results")
	private List<ImdbTitle> results;

	public ImdbGenre()
	{ super(); }

	public ImdbGenre(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<ImdbTitle> getResults()
	{
		return results;
	}

	public void setResults(List<ImdbTitle> results)
	{
		this.results = results;
	}
}
