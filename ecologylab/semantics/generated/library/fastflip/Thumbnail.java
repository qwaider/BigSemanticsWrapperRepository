package ecologylab.semantics.generated.library.fastflip;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  Thumbnail.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/20/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Thumbnail extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL pic;

	public Thumbnail()
	{ }

	public Thumbnail(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	pic()
	{
		MetadataParsedURL	result = this.pic;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.pic = result;
		}
		return result;
	}

	public ParsedURL getPic()
	{
		return this.pic().getValue();
	}

	public MetadataParsedURL getPicMetadata()
	{
		return pic;
	}

	public void setPic(ParsedURL pic)
	{
		this.pic().setValue(pic);
	}

	public void setPicMetadata(MetadataParsedURL pic)
	{
		this.pic = pic;
	}
}
