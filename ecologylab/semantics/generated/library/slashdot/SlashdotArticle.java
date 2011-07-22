package ecologylab.semantics.generated.library.slashdot;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.generated.library.slashdot.MmdInlineAnchorInAnchorsInSlashdotArticle;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  SlashdotArticle.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/22/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class SlashdotArticle extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString poster;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL posterUrl;

	/** 
	 */ 
	@simpl_collection("anchor") @mm_name("anchors")	private List<MmdInlineAnchorInAnchorsInSlashdotArticle> anchors;

	public SlashdotArticle()
	{ }

	public SlashdotArticle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	poster()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.poster;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.poster = result;
		}
		return result;
	}

	public java.lang.String getPoster()
	{
		return this.poster == null ? null : poster().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPosterMetadata()
	{
		return poster;
	}

	public void setPoster(java.lang.String poster)
	{
		if (poster != null)
			this.poster().setValue(poster);
	}

	public void setPosterMetadata(ecologylab.semantics.metadata.scalar.MetadataString poster)
	{
		this.poster = poster;
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	posterUrl()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.posterUrl;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.posterUrl = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getPosterUrl()
	{
		return this.posterUrl == null ? null : posterUrl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPosterUrlMetadata()
	{
		return posterUrl;
	}

	public void setPosterUrl(ecologylab.net.ParsedURL posterUrl)
	{
		if (posterUrl != null)
			this.posterUrl().setValue(posterUrl);
	}

	public void setPosterUrlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL posterUrl)
	{
		this.posterUrl = posterUrl;
	}

	public List<MmdInlineAnchorInAnchorsInSlashdotArticle> getAnchors()
	{
		return anchors;
	}

	public void setAnchors(List<MmdInlineAnchorInAnchorsInSlashdotArticle> anchors)
	{
		this.anchors = anchors;
	}
}
