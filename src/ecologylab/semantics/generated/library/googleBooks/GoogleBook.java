package ecologylab.semantics.generated.library.googleBooks;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.googleBooks.Page;
import ecologylab.semantics.generated.library.publication.Book;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_scope;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class GoogleBook extends Book
{
	@simpl_scalar
	private MetadataString category;

	@simpl_scalar
	private MetadataParsedURL placesMentionedKml;

	@simpl_collection("page")
	@mm_name("selected_pages")
	private List<Page> selectedPages;

	@simpl_collection
	@simpl_scope("repository_documents")
	@mm_name("citations")
	private List<Document> citations;

	public GoogleBook()
	{ super(); }

	public GoogleBook(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	category()
	{
		MetadataString	result = this.category;
		if (result == null)
		{
			result = new MetadataString();
			this.category = result;
		}
		return result;
	}

	public String getCategory()
	{
		return this.category == null ? null : category().getValue();
	}

	public MetadataString getCategoryMetadata()
	{
		return category;
	}

	public void setCategory(String category)
	{
		if (category != null)
			this.category().setValue(category);
	}

	public void setCategoryMetadata(MetadataString category)
	{
		this.category = category;
	}

	public MetadataParsedURL	placesMentionedKml()
	{
		MetadataParsedURL	result = this.placesMentionedKml;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.placesMentionedKml = result;
		}
		return result;
	}

	public ParsedURL getPlacesMentionedKml()
	{
		return this.placesMentionedKml == null ? null : placesMentionedKml().getValue();
	}

	public MetadataParsedURL getPlacesMentionedKmlMetadata()
	{
		return placesMentionedKml;
	}

	public void setPlacesMentionedKml(ParsedURL placesMentionedKml)
	{
		if (placesMentionedKml != null)
			this.placesMentionedKml().setValue(placesMentionedKml);
	}

	public void setPlacesMentionedKmlMetadata(MetadataParsedURL placesMentionedKml)
	{
		this.placesMentionedKml = placesMentionedKml;
	}

	public List<Page> getSelectedPages()
	{
		return selectedPages;
	}

	public void setSelectedPages(List<Page> selectedPages)
	{
		this.selectedPages = selectedPages;
	}

	public List<Document> getCitations()
	{
		return citations;
	}

	public void setCitations(List<Document> citations)
	{
		this.citations = citations;
	}
}
