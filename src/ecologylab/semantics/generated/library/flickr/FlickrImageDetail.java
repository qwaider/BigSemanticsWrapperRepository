package ecologylab.semantics.generated.library.flickr;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.flickr.FlickrTag;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *A Flickr Image result page
 */ 
@simpl_inherit
public class FlickrImageDetail extends CompoundDocument
{
	@simpl_scalar
	private MetadataParsedURL thumbnailKludge;

	@simpl_scalar
	private MetadataParsedURL imageKludge;

	@simpl_collection("flickr_tag")
	@mm_name("flickr_tags")
	private List<FlickrTag> flickrTags;

	public FlickrImageDetail()
	{ super(); }

	public FlickrImageDetail(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	thumbnailKludge()
	{
		MetadataParsedURL	result = this.thumbnailKludge;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.thumbnailKludge = result;
		}
		return result;
	}

	public ParsedURL getThumbnailKludge()
	{
		return this.thumbnailKludge == null ? null : thumbnailKludge().getValue();
	}

	public MetadataParsedURL getThumbnailKludgeMetadata()
	{
		return thumbnailKludge;
	}

	public void setThumbnailKludge(ParsedURL thumbnailKludge)
	{
		if (thumbnailKludge != null)
			this.thumbnailKludge().setValue(thumbnailKludge);
	}

	public void setThumbnailKludgeMetadata(MetadataParsedURL thumbnailKludge)
	{
		this.thumbnailKludge = thumbnailKludge;
	}

	public MetadataParsedURL	imageKludge()
	{
		MetadataParsedURL	result = this.imageKludge;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.imageKludge = result;
		}
		return result;
	}

	public ParsedURL getImageKludge()
	{
		return this.imageKludge == null ? null : imageKludge().getValue();
	}

	public MetadataParsedURL getImageKludgeMetadata()
	{
		return imageKludge;
	}

	public void setImageKludge(ParsedURL imageKludge)
	{
		if (imageKludge != null)
			this.imageKludge().setValue(imageKludge);
	}

	public void setImageKludgeMetadata(MetadataParsedURL imageKludge)
	{
		this.imageKludge = imageKludge;
	}

	public List<FlickrTag> getFlickrTags()
	{
		return flickrTags;
	}

	public void setFlickrTags(List<FlickrTag> flickrTags)
	{
		this.flickrTags = flickrTags;
	}
}
