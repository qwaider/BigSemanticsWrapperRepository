package ecologylab.semantics.generated.library.slashdot;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.generated.library.slashdot.SlashdotItem;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  SlashdotRss.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
@xml_tag("rdf:RDF")
public class SlashdotRss extends CompoundDocument
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("item")	@mm_name("items")
	private List<SlashdotItem> items;

	public SlashdotRss()
	{ }

	public SlashdotRss(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<SlashdotItem> getItems()
	{
		return items;
	}

	public void setItems(List<SlashdotItem> items)
	{
		this.items = items;
	}
}
