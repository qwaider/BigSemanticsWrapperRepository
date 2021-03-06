package ecologylab.bigsemantics.test.library.generics;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class SocialMediaSearchResultForTest extends Document
{
	@simpl_scalar
	private MetadataString author;

	@simpl_collection("tag")
	@mm_name("tags")
	private List<MetadataString> tags;

	public SocialMediaSearchResultForTest()
	{ super(); }

	public SocialMediaSearchResultForTest(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	author()
	{
		MetadataString	result = this.author;
		if (result == null)
		{
			result = new MetadataString();
			this.author = result;
		}
		return result;
	}

	public String getAuthor()
	{
		return this.author == null ? null : author().getValue();
	}

	public MetadataString getAuthorMetadata()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		if (author != null)
			this.author().setValue(author);
	}

	public void setAuthorMetadata(MetadataString author)
	{
		this.author = author;
	}

	public List<MetadataString> getTags()
	{
		return tags;
	}

  // lazy evaluation:
  public List<MetadataString> tags()
  {
    if (tags == null)
      tags = new ArrayList<MetadataString>();
    return tags;
  }

  // addTo:
  public void addToTags(MetadataString element)
  {
    tags().add(element);
  }

  // size:
  public int tagsSize()
  {
    return tags == null ? 0 : tags.size();
  }

	public void setTags(List<MetadataString> tags)
	{
		this.tags = tags;
	}
}
