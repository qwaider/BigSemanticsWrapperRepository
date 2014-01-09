package ecologylab.bigsemantics.generated.library.rss;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.rss.YahooMediaRss;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.Hint;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_hints;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *One item in a news feed.
 */ 
@simpl_inherit
public class Item extends YahooMediaRss
{
	@simpl_scalar
	@simpl_hints({Hint.XML_LEAF})
	private MetadataParsedURL link;

	@simpl_collection("category")
	@simpl_nowrap
	@mm_name("categories")
	private List<MetadataString> categories;

	public Item()
	{ super(); }

	public Item(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	link()
	{
		MetadataParsedURL	result = this.link;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.link = result;
		}
		return result;
	}

	public ParsedURL getLink()
	{
		return this.link == null ? null : link().getValue();
	}

	public MetadataParsedURL getLinkMetadata()
	{
		return link;
	}

	public void setLink(ParsedURL link)
	{
		if (link != null)
			this.link().setValue(link);
	}

	public void setLinkMetadata(MetadataParsedURL link)
	{
		this.link = link;
	}

	public List<MetadataString> getCategories()
	{
		return categories;
	}

  // lazy evaluation:
  public List<MetadataString> categories()
  {
    if (categories == null)
      categories = new ArrayList<MetadataString>();
    return categories;
  }

  // addTo:
  public void addToCategories(MetadataString element)
  {
    categories().add(element);
  }

  // size:
  public int categoriesSize()
  {
    return categories == null ? 0 : categories.size();
  }

	public void setCategories(List<MetadataString> categories)
	{
		this.categories = categories;
	}
}
