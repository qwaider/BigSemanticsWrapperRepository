package ecologylab.semantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.Bookmark;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *Delicious home page class
 */ 
@simpl_inherit
public class DeliciousHomepage extends CompoundDocument
{
	@simpl_collection("bookmark")
	@mm_name("bookmarks")
	private List<Bookmark> bookmarks;

	public DeliciousHomepage()
	{ super(); }

	public DeliciousHomepage(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Bookmark> getBookmarks()
	{
		return bookmarks;
	}

	public void setBookmarks(List<Bookmark> bookmarks)
	{
		this.bookmarks = bookmarks;
	}
}
