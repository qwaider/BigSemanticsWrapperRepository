package ecologylab.semantics.generated.library.nsdl;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.generated.library.nsdl.NsdlDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  MmdInlineSearchResultsInNsdlService.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/22/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineSearchResultsInNsdlService extends Metadata
{
	/** 
	 */ 
	@simpl_collection("nsdl_document") @mm_name("results")	private List<NsdlDocument> results;

	public MmdInlineSearchResultsInNsdlService()
	{ }

	public MmdInlineSearchResultsInNsdlService(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<NsdlDocument> getResults()
	{
		return results;
	}

	public void setResults(List<NsdlDocument> results)
	{
		this.results = results;
	}
}
