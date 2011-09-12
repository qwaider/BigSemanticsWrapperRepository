package ecologylab.semantics.generated.library.imdb;

import java.util.ArrayList;
import ecologylab.semantics.generated.library.imdb.ImdbTitle;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;

/**
*  ImdbGenre.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * IMDB genre
 */ 
@simpl_inherit
public class ImdbGenre extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("imdb_title")	@mm_name("results")
	private List<ImdbTitle> results;

	public ImdbGenre()
	{ }

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
