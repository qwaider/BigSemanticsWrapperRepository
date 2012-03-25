package ecologylab.semantics.generated.library.slashdot;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.slashdot.SlashdotItem;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
@simpl_tag("rdf:RDF")
public class SlashdotRss extends CompoundDocument
{
	@simpl_collection("item")
	@simpl_nowrap
	@mm_name("items")
	private List<SlashdotItem> items;

	public SlashdotRss()
	{ super(); }

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
