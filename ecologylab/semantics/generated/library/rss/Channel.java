package ecologylab.semantics.generated.library.rss;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.generated.library.rss.Item;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Channel.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/21/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Channel extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString title;

	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("item") @mm_name("items")	private List<Item> items;

	public Channel()
	{ }

	public Channel(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	title()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.title;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.title = result;
		}
		return result;
	}

	public java.lang.String getTitle()
	{
		return this.title == null ? null : title().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTitleMetadata()
	{
		return title;
	}

	public void setTitle(java.lang.String title)
	{
		if (title != null)
			this.title().setValue(title);
	}

	public void setTitleMetadata(ecologylab.semantics.metadata.scalar.MetadataString title)
	{
		this.title = title;
	}

	public List<Item> getItems()
	{
		return items;
	}

	public void setItems(List<Item> items)
	{
		this.items = items;
	}
}
