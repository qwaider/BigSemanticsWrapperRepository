package ecologylab.semantics.generated.library.googleBooks;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlinePageInSelectedPagesInGoogleBook.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/22/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlinePageInSelectedPagesInGoogleBook extends Document
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL pageThumbnail;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataInteger pageNumber;

	public MmdInlinePageInSelectedPagesInGoogleBook()
	{ }

	public MmdInlinePageInSelectedPagesInGoogleBook(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	pageThumbnail()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.pageThumbnail;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.pageThumbnail = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getPageThumbnail()
	{
		return this.pageThumbnail == null ? null : pageThumbnail().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPageThumbnailMetadata()
	{
		return pageThumbnail;
	}

	public void setPageThumbnail(ecologylab.net.ParsedURL pageThumbnail)
	{
		if (pageThumbnail != null)
			this.pageThumbnail().setValue(pageThumbnail);
	}

	public void setPageThumbnailMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL pageThumbnail)
	{
		this.pageThumbnail = pageThumbnail;
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger	pageNumber()
	{
		ecologylab.semantics.metadata.scalar.MetadataInteger	result = this.pageNumber;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataInteger();
			this.pageNumber = result;
		}
		return result;
	}

	public java.lang.Integer getPageNumber()
	{
		return this.pageNumber == null ? 0 : pageNumber().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getPageNumberMetadata()
	{
		return pageNumber;
	}

	public void setPageNumber(java.lang.Integer pageNumber)
	{
		if (pageNumber != 0)
			this.pageNumber().setValue(pageNumber);
	}

	public void setPageNumberMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger pageNumber)
	{
		this.pageNumber = pageNumber;
	}
}
