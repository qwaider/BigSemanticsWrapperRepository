//
// BingSearchApi.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.SearchNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.SearchNS 
{
	/// <summary>
	/// The bing Search api.
	/// </summary>
	[SimplInherit]
	public class BingSearchApi : Search<Document>
	{
		[SimplComposite]
		[MmName("search_crumb_composite")]
		private SearchCrumb searchCrumbComposite;

		public BingSearchApi()
		{ }

		public BingSearchApi(MetaMetadataCompositeField mmd) : base(mmd) { }


		public SearchCrumb SearchCrumbComposite
		{
			get{return searchCrumbComposite;}
			set
			{
				if (this.searchCrumbComposite != value)
				{
					this.searchCrumbComposite = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
