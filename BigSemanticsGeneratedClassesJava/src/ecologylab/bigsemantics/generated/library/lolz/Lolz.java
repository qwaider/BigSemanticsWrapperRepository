package ecologylab.bigsemantics.generated.library.lolz;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creative_work.CreativeWork;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

/** 
 *The LOLZ class
 */ 
@simpl_inherit
public class Lolz extends CreativeWork
{
	@simpl_scalar
	private MetadataString caption;

	@simpl_scalar
	private MetadataParsedURL picture;

	@simpl_scalar
	private MetadataParsedURL mightLike;

	public Lolz()
	{ super(); }

	public Lolz(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	caption()
	{
		MetadataString	result = this.caption;
		if (result == null)
		{
			result = new MetadataString();
			this.caption = result;
		}
		return result;
	}

	public String getCaption()
	{
		return this.caption == null ? null : caption().getValue();
	}

	public MetadataString getCaptionMetadata()
	{
		return caption;
	}

	public void setCaption(String caption)
	{
		if (caption != null)
			this.caption().setValue(caption);
	}

	public void setCaptionMetadata(MetadataString caption)
	{
		this.caption = caption;
	}

	public MetadataParsedURL	picture()
	{
		MetadataParsedURL	result = this.picture;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.picture = result;
		}
		return result;
	}

	public ParsedURL getPicture()
	{
		return this.picture == null ? null : picture().getValue();
	}

	public MetadataParsedURL getPictureMetadata()
	{
		return picture;
	}

	public void setPicture(ParsedURL picture)
	{
		if (picture != null)
			this.picture().setValue(picture);
	}

	public void setPictureMetadata(MetadataParsedURL picture)
	{
		this.picture = picture;
	}

	public MetadataParsedURL	mightLike()
	{
		MetadataParsedURL	result = this.mightLike;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.mightLike = result;
		}
		return result;
	}

	public ParsedURL getMightLike()
	{
		return this.mightLike == null ? null : mightLike().getValue();
	}

	public MetadataParsedURL getMightLikeMetadata()
	{
		return mightLike;
	}

	public void setMightLike(ParsedURL mightLike)
	{
		if (mightLike != null)
			this.mightLike().setValue(mightLike);
	}

	public void setMightLikeMetadata(MetadataParsedURL mightLike)
	{
		this.mightLike = mightLike;
	}
}
