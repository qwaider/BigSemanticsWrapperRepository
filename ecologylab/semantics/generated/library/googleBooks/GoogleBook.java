package ecologylab.semantics.generated.library.googleBooks;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.generated.library.googleBooks.GoogleBook;
import java.util.List;
import ecologylab.semantics.generated.library.googleBooks.MmdInlinePageInSelectedPagesInGoogleBook;
import ecologylab.semantics.generated.library.publication.Book;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  GoogleBook.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/22/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class GoogleBook extends Book
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString category;

	/** 
	 */ 
	@simpl_collection("google_book") @mm_name("references_from_books")	private List<GoogleBook> referencesFromBooks;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL placesMentionedKml;

	/** 
	 */ 
	@simpl_collection("page") @mm_name("selected_pages")	private List<MmdInlinePageInSelectedPagesInGoogleBook> selectedPages;

	public GoogleBook()
	{ }

	public GoogleBook(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	category()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.category;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.category = result;
		}
		return result;
	}

	public java.lang.String getCategory()
	{
		return this.category == null ? null : category().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getCategoryMetadata()
	{
		return category;
	}

	public void setCategory(java.lang.String category)
	{
		if (category != null)
			this.category().setValue(category);
	}

	public void setCategoryMetadata(ecologylab.semantics.metadata.scalar.MetadataString category)
	{
		this.category = category;
	}

	public List<GoogleBook> getReferencesFromBooks()
	{
		return referencesFromBooks;
	}

	public void setReferencesFromBooks(List<GoogleBook> referencesFromBooks)
	{
		this.referencesFromBooks = referencesFromBooks;
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	placesMentionedKml()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.placesMentionedKml;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.placesMentionedKml = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getPlacesMentionedKml()
	{
		return this.placesMentionedKml == null ? null : placesMentionedKml().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPlacesMentionedKmlMetadata()
	{
		return placesMentionedKml;
	}

	public void setPlacesMentionedKml(ecologylab.net.ParsedURL placesMentionedKml)
	{
		if (placesMentionedKml != null)
			this.placesMentionedKml().setValue(placesMentionedKml);
	}

	public void setPlacesMentionedKmlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL placesMentionedKml)
	{
		this.placesMentionedKml = placesMentionedKml;
	}

	public List<MmdInlinePageInSelectedPagesInGoogleBook> getSelectedPages()
	{
		return selectedPages;
	}

	public void setSelectedPages(List<MmdInlinePageInSelectedPagesInGoogleBook> selectedPages)
	{
		this.selectedPages = selectedPages;
	}
}
